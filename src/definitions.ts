export interface Base64Plugin {
  echo(options: { value: string }): Promise<{ value: string }>;
}
